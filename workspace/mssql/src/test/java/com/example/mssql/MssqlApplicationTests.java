package com.example.mssql;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@Slf4j
@SpringBootTest
class MssqlApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	public void dbConnect() throws SQLException {
		try(Connection connection=dataSource.getConnection()){
			DatabaseMetaData metaData=connection.getMetaData();

			log.info("Url:"+metaData.getURL());
		}
	}
//	@Test
//	void contextLoads() {
//	}

}
