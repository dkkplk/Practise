package java.com.swiggy.expshare.cmd;

import java.util.List;

public interface CommandType {

	public List<String> perform(Command command,List<String> arguments);
}
