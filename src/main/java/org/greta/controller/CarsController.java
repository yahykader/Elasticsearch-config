
 /* package org.greta.controller;
  
  import java.io.IOException; import java.net.InetAddress;
  
  import java.util.Map; import java.util.concurrent.ExecutionException;
  
  import org.elasticsearch.action.delete.DeleteRequest; import
  org.elasticsearch.action.delete.DeleteResponse; import
  org.elasticsearch.action.get.GetResponse; import
  org.elasticsearch.action.index.IndexResponse; import
  org.elasticsearch.action.update.UpdateRequest; import
  org.elasticsearch.action.update.UpdateResponse; import
  org.elasticsearch.client.transport.TransportClient; import
  org.elasticsearch.common.settings.Settings; import
  org.elasticsearch.common.transport.TransportAddress; import
  org.elasticsearch.common.xcontent.XContentBuilder; import
  org.elasticsearch.transport.client.PreBuiltTransportClient; import
  org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.bind.annotation.PathVariable; import
  org.springframework.web.bind.annotation.RequestMapping; import
  org.springframework.web.bind.annotation.RestController; import static
  org.elasticsearch.common.xcontent.XContentFactory.*;
  
  @RestController
  
  @RequestMapping("/rest/cars") 
  public class CarsController { 
	  TransportClient
  client = null;
  
  
  public CarsController() throws IOException {
  
		  client = new PreBuiltTransportClient(Settings.EMPTY) .addTransportAddress(new
		  TransportAddress(InetAddress.getByName("localhost"), 9300)); 
  }
  
  @GetMapping("/insert/{id}") 
  public Object insert(@PathVariable final String id) throws IOException{
  
   XContentBuilder builder = null;
  
     builder = jsonBuilder() 
    		 .startObject() 
    		 .field("name", "yahyaoui")
             .field("salary", "1400") 
             .field("job", "Elasticsearch") 
             .endObject();
  
  
  IndexResponse response = client.prepareIndex("employe","id",id)
  .setSource(builder) .get(); return response.getResult().toString();
  
  }
  
  @GetMapping("/view/{id}")
  public Map<String,Object> view(@PathVariable final String id){
  
			  GetResponse getResponse = client.prepareGet("employe","id", id).get();
			  System.out.println(getResponse.getSource());
  
    return getResponse.getSource(); 
    }
  
  @GetMapping("/update/{id}") 
  public String update(@PathVariable final String id) throws IOException {
  
		  UpdateRequest updateRequest = new UpdateRequest();
		   updateRequest.index("employe") 
		                 .type("id")
		                 .id(id) 
		                 .doc(jsonBuilder()
		  .startObject() .field("gender","male") .endObject());
		  
  try { 
	  UpdateResponse updateResponse= client.update(updateRequest).get();
                         System.out.println(updateResponse.status()); return
                         updateResponse.status().toString(); }catch(InterruptedException |ExecutionException e) { 
                        	 System.out.println(e); } return "Exception"; 
                        	 }
  
  @GetMapping("/delete/{id}") 
  public String delete(@PathVariable final String id) {
  
  DeleteResponse deleteResponse = client.prepareDelete("employe","id",id).get();
  
  System.out.println(deleteResponse.getResult().toString());
  
  return deleteResponse.getResult().toString();
  
  }
  
  
  
  }
 */