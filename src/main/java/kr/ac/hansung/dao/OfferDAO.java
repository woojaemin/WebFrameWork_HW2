package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Offer;

@Repository
public class OfferDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public int getRowCount() {
		String sqlStatement = "select count(*) from offers";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);	
	}
	
	
	public List<Offer> getOffer(String year, String semester) {
		String sqlStatement = "select * from offers where year=? and semester=?";
		return jdbcTemplate.query(sqlStatement, new Object[] {year,semester}, 
				new RowMapper<Offer>(){

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();
						offer.setYear(rs.getString("year"));
						offer.setSemester(rs.getString("semester"));
						offer.setCode(rs.getString("code"));
						offer.setName(rs.getString("name"));
						offer.setDevision(rs.getString("devision"));
						offer.setScore(rs.getString("score"));
						
						return offer;
					} 
				} 
		);
	}	

	public List<Offer> getOffers() {
		String sqlStatement = "select * from offers";
		return jdbcTemplate.query(sqlStatement, 
				new RowMapper<Offer>(){

					@Override
					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						 
						
						Offer offer = new Offer();
						offer.setYear(rs.getString("year"));
						offer.setSemester(rs.getString("semester"));
						offer.setCode(rs.getString("code"));
						offer.setName(rs.getString("name"));
						offer.setDevision(rs.getString("devision"));
						offer.setScore(rs.getString("score"));
						
						return offer;
					} 
				} 
		);
	}	
	
	public List<Offer> getOffers2019() {
		String sqlStatement = "select * from offers where year=?";
		return jdbcTemplate.query(sqlStatement, new Object[] { "2019" }, new RowMapper<Offer>() {

			@Override
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {


				Offer offer = new Offer();
				offer.setYear(rs.getString("year"));
				offer.setSemester(rs.getString("semester"));
				offer.setCode(rs.getString("code"));
				offer.setName(rs.getString("name"));
				offer.setDevision(rs.getString("devision"));
				offer.setScore(rs.getString("score"));

				return offer;
			}
		});
	}
	
	public List<Offer> getYearSemesterSum() {
		String sqlStatement = "select year, semester, sum(score) from offers group by year, semester";
		return jdbcTemplate.query(sqlStatement, new RowMapper<Offer>() {
			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offer offer = new Offer();
				offer.setYear(rs.getString("year"));
				offer.setSemester(rs.getString("semester"));
				offer.setScore(rs.getString("sum(score)"));
				return offer;
			}
		});
	}
	
	public boolean insert(Offer offer) {
		String code = offer.getCode();
		String name = offer.getName();
		String devision = offer.getDevision();
		String score = offer.getScore();
		
		String sqlStatement = "insert into offers (year,semester,code,name,devision,score) values (?,?,?,?,?,?)";
		
		return (jdbcTemplate.update(sqlStatement, new Object[] {"2019","1",code,name,devision,score} )==1);
		
	}
	
	
	public boolean delete(String name) {
		String sqlStatement = "delete from offers where name=?";
		
		return (jdbcTemplate.update(sqlStatement, new Object[] {name}) ==1);
	}
		
}
