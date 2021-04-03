package us.prajit.activemqpoc.model;

import java.io.Serializable;

public class Message implements Serializable {

	private static final long serialVersionUID = 5201090251905307901L;

	private String source;
	private String msg;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Message [source=" + source + ", msg=" + msg + "]";
	}

}
