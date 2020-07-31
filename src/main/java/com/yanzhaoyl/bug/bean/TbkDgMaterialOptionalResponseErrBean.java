package com.yanzhaoyl.bug.bean;

import com.yanzhaoyl.bug.bean.TbkDgMaterialOptionalResponseErr.Error_response;

import lombok.Data;

@Data
public class TbkDgMaterialOptionalResponseErrBean {
	
    private Error_response error_response;

    
    public int getCode(){
        return this.error_response.getCode();
    }
    
    public String getMsg(){
        return this.error_response.getMsg();
    }
    
}

