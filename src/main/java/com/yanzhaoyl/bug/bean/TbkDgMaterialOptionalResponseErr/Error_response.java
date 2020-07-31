package com.yanzhaoyl.bug.bean.TbkDgMaterialOptionalResponseErr;

public class Error_response
{
    private int code;

    private String msg;

    private String sub_code;

    private String sub_msg;

    private String request_id;

    public void setCode(int code){
        this.code = code;
    }
    public int getCode(){
        return this.code;
    }
    public void setMsg(String msg){
        this.msg = msg;
    }
    public String getMsg(){
        return this.msg;
    }
    public void setSub_code(String sub_code){
        this.sub_code = sub_code;
    }
    public String getSub_code(){
        return this.sub_code;
    }
    public void setSub_msg(String sub_msg){
        this.sub_msg = sub_msg;
    }
    public String getSub_msg(){
        return this.sub_msg;
    }
    public void setRequest_id(String request_id){
        this.request_id = request_id;
    }
    public String getRequest_id(){
        return this.request_id;
    }
	@Override
	public String toString() {
		return "Error_response [code=" + code + ", msg=" + msg + ", sub_code=" + sub_code + ", sub_msg=" + sub_msg
				+ ", request_id=" + request_id + "]";
	}

}
