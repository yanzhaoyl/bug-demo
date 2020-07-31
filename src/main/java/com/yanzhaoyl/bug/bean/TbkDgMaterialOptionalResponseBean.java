package com.yanzhaoyl.bug.bean;

import java.io.Serializable;
import java.util.List;

import com.yanzhaoyl.bug.bean.TbkDgMaterialOptionalResponse.Map_data;
import com.yanzhaoyl.bug.bean.TbkDgMaterialOptionalResponse.Tbk_dg_material_optional_response;


public class TbkDgMaterialOptionalResponseBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6791907801968536600L;
	
	private Tbk_dg_material_optional_response tbk_dg_material_optional_response;

	public void setTbk_dg_material_optional_response(
			Tbk_dg_material_optional_response tbk_dg_material_optional_response) {
		this.tbk_dg_material_optional_response = tbk_dg_material_optional_response;
	}

	public Tbk_dg_material_optional_response getTbk_dg_material_optional_response() {
		return this.tbk_dg_material_optional_response;
	}

	/** 直接 拿到商品数据集合 */
	public List<Map_data> getMap_data() {
		return tbk_dg_material_optional_response.getResult_list().getMap_data();
	}
	
	/** 直接 拿到搜索结果总数 */
	public int getTotal_results() {
		return tbk_dg_material_optional_response.getTotal_results();
	}
	
	
}
