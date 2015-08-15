package com.ysj.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.ysj.dao.UserDAO;
import com.ysj.db.RsMappingObject;
import com.ysj.db.SQLTemplate;
import com.ysj.db.SQLTemplateImpl;
import com.ysj.pojo.User;

public class UserDAOImpl implements UserDAO {
	private SQLTemplate sqlT = null;
	
	public UserDAOImpl() {
		sqlT = new SQLTemplateImpl();
	}
	
	@SuppressWarnings("unchecked")
	public List<User> queryAll() {
		return(List<User>) sqlT.query("select * from T_Enterprises", null, new UserRsMappingObject());
	}
	
	public void add(User u){
		sqlT.update("insert into T_Enterprises(name,select_key,files_num,licence_num,"
				+"permit_name,login_address,legal_peo,permit_peo,quality_peo,storage_address,"
				+"vaild_until,operate_way,operate_scope,certificate_organ,certificate_date,"
				+"login_num,license_name,license_address,delegate_name,login_capital,paid_capital,"
				+"company_type,license_scope,establish_date,license_start,license_end,license_organ,"
				+"license_date,gsp_num,gsp_name,gsp_address,gsp_scope,gsp_end,gsp_organ,gsp_date,open_name,open_bank,open_num,"
				+"tax_num,tax_name,tax_peo,tax_address,tax_type,tax_scope,tax_p_organ,tax_pay,tax_organ,"
				+"tax_date,code_id,code_name,code_scope,code_address,code_start,code_end,code_monad,code_num) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new Object[]{u.getName(),u.getSelect_key(),u.getFiles_num(),u.getLicence_num(),
						u.getPermit_name(),u.getLogin_address(),u.getLegal_peo(),u.getQuality_peo(),u.getStorage_address(),
						u.getValid_until(),u.getOperate_way(),u.getOperate_scope(),u.getCertificate_organ(),u.getCertificate_date(),
						u.getLogin_num(),u.getLicense_name(),u.getLicense_address(),u.getDelegate_name(),u.getLogin_capital(),u.getPaid_captial(),
						u.getCompany_type(),u.getLicense_scope(),u.getEstablish_date(),u.getLicense_start(),u.getLicense_end(),u.getLicense_organ(),
						u.getLicense_date(),u.getGsp_num(),u.getGsp_name(),u.getGsp_address(),u.getGsp_scope(),u.getGsp_end(),u.getGsp_organ(),u.getGsp_date(),u.getOpen_name(),u.getOpen_bank(),u.getOpen_num(),
						u.getTax_num(),u.getTax_name(),u.getTax_peo(),u.getTax_address(),u.getTax_type(),u.getTax_scope(),u.getTax_p_organ(),u.getTax_pay(),u.getTax_organ(),
						u.getTax_date(),u.getCode_id(),u.getCode_name(),u.getCode_scope(),u.getCode_address(),u.getCode_start(),u.getCode_end(),u.getCode_monad(),u.getCode_num()});
	}
	
	
	
	public void update(User u) {
		sqlT.update("update T_Enterprises set name=?,select_key=?,files_num=?,licence_num=?,"
				+"permit_name=?,login_address=?,legal_peo=?,permit_peo=?,quality_peo=?,storage_address=?,"
				+"vaild_until=?,operate_way=?,operate_scope=?,certificate_organ=?,certificate_date=?,"
				+"login_num=?,license_name=?,license_address=?,delegate_name=?,login_capital=?,paid_capital=?,"
				+"company_type=?,license_scope=?,establish_date=?,license_start=?,license_end=?,license_organ=?,"
				+"license_date=?,gsp_num=?,gsp_name=?,gsp_address=?,gsp_scope=?,gsp_end=?,gsp_organ=?,gsp_date=?,open_name=?,open_bank=?,open_num=?,"
				+"tax_num=?,tax_name=?,tax_peo=?,tax_address=?,tax_type=?,tax_scope=?,tax_p_organ=?,tax_pay=?,tax_organ=?,"
				+"tax_date=?,code_id=?,code_name=?,code_scope=?,code_address=?,code_start=?,code_end=?,code_monad=?,code_num=? where id=?", 
				new Object[]{u.getName(),u.getSelect_key(),u.getFiles_num(),u.getLicence_num(),
						u.getPermit_name(),u.getLogin_address(),u.getLegal_peo(),u.getQuality_peo(),u.getStorage_address(),
						u.getValid_until(),u.getOperate_way(),u.getOperate_scope(),u.getCertificate_organ(),u.getCertificate_date(),
						u.getLogin_num(),u.getLicense_name(),u.getLicense_address(),u.getDelegate_name(),u.getLogin_capital(),u.getPaid_captial(),
						u.getCompany_type(),u.getLicense_scope(),u.getEstablish_date(),u.getLicense_start(),u.getLicense_end(),u.getLicense_organ(),
						u.getLicense_date(),u.getGsp_num(),u.getGsp_name(),u.getGsp_address(),u.getGsp_scope(),u.getGsp_end(),u.getGsp_organ(),u.getGsp_date(),u.getOpen_name(),u.getOpen_bank(),u.getOpen_num(),
						u.getTax_num(),u.getTax_name(),u.getTax_peo(),u.getTax_address(),u.getTax_type(),u.getTax_scope(),u.getTax_p_organ(),u.getTax_pay(),u.getTax_organ(),
						u.getTax_date(),u.getCode_id(),u.getCode_name(),u.getCode_scope(),u.getCode_address(),u.getCode_start(),u.getCode_end(),u.getCode_monad(),u.getCode_num(),u.getId()});
		
	}
	
	public void delete(User u) {
		sqlT.update("delete from T_Enterprises where id = ?", new Object[]{u.getId()});
		
	}
	
	class UserRsMappingObject implements RsMappingObject{

		public Object mapper2Obj(ResultSet rs) {
			User user = null;
				user = new User();
				try {
					user.setName(rs.getString("name"));
					user.setSelect_key(rs.getString("select_key"));
					user.setFiles_num(rs.getString("files_num"));
				} catch (SQLException e) {
					e.printStackTrace();
				}
			return user;
		}
		
	}


	


	
	
	
}
