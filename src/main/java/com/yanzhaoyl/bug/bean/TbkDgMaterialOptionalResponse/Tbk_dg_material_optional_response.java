package com.yanzhaoyl.bug.bean.TbkDgMaterialOptionalResponse;

public class Tbk_dg_material_optional_response {
	private Result_list result_list;

	private int total_results;

	private String request_id;

	public void setResult_list(Result_list result_list) {
		this.result_list = result_list;
	}

	public Result_list getResult_list() {
		return this.result_list;
	}

	public void setTotal_results(int total_results) {
		this.total_results = total_results;
	}

	public int getTotal_results() {
		return this.total_results;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	public String getRequest_id() {
		return this.request_id;
	}
}