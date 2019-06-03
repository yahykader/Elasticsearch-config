package ConfigElastic;


import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.node.NodeBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "org.greta.repository")
public class Config {
	
	/*
	 * @Bean public NodeBuilder nodeBuilder(){
	 * 
	 * return new NodeBuilder(); }
	 */
	 
	 @Bean
	  public Client client() {
		 
		 TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
			        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));
		 
	        return new Client();
	    }

  @Bean
  public ElasticsearchOperations elasticsearchTemplate() throws IOException {
     File tmpDir=null;

	            tmpDir= File.createTempFile("temp-elastic", Long.toString(System.nanoTime()));

	            Settings.Builder elasticsearchSettings = Settings.builder()
                       .put("http.enabled", "true")
                       .put("index.number_of_shards", "1")
                       .put("path.data", new File(tmpDir, "data").getAbsolutePath())
                       .put("path.logs", new File(tmpDir, "logs").getAbsolutePath())
                       .put("path.work", new File(tmpDir, "work").getAbsolutePath())
                       .put("path.home", tmpDir);

	           return new ElasticsearchTemplate(nodeBuilder()
                              .local(true)
                              .node()
                              .client());
	 }
	
	
	
	

}
