package com.sgic.common.api.response;

public class ValidationFailure {
  public ValidationFailure(String field, String code) {
    this.reason = field;
    this.code = code;
  }

  private String reason;

  private String code;

public String getReason() {
	return reason;
}

public void setReason(String reason) {
	this.reason = reason;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

}
