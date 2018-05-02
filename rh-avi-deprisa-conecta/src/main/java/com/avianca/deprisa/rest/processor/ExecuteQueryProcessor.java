package com.avianca.deprisa.rest.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.camel.BeanInject;
import org.apache.camel.Exchange;
import org.springframework.jdbc.core.JdbcTemplate;

public class ExecuteQueryProcessor {

	@BeanInject(value = "props")
	private Properties properties;

	private JdbcTemplate jdbcTemplate;
	private DataSource dataQuery;

	public void setDataQuery(DataSource dataQuery) {
		this.dataQuery = dataQuery;
		this.jdbcTemplate = new JdbcTemplate(dataQuery);
	}

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void executeQueryProgramas(Exchange exchange) {
		
		final String queryUsuario = (String) properties.getProperty("sql.consulta.usuario");
                final String queryCodigo = (String) properties.getProperty("sql.consulta.codigo");
                final String idUsuario = (String) exchange.getIn().getHeader("idUsuario");
                final int filterType = (int) exchange.getIn().getHeader("filterType");
                if(filterType == 1){
                List<Map<String, Object>> listUsuario = new ArrayList<>();
                listUsuario = this.jdbcTemplate.queryForList(queryUsuario,idUsuario);
                exchange.getIn().setBody(listUsuario);
                }else{
                List<Map<String, Object>> listCodigo = new ArrayList<>();		
		listCodigo = this.jdbcTemplate.queryForList(queryCodigo,idUsuario);    
                exchange.getIn().setBody(listCodigo);
                }		                
                //System.out.println("IMPRIMEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE LISTA"   + idUsuario +list+query );
	}

}
