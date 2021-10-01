package java.com.swiggy.expshare.cmd;

public class Command {

	private String commandId;
	private String commandName;
	private CommandType commandType;

	public Command(String commandId, String commandName, CommandType commandType) {
		super();
		this.commandId = commandId;
		this.commandName = commandName;
		this.commandType = commandType;
	}

	public String getCommandId() {
		return commandId;
	}

	public void setCommandId(String commandId) {
		this.commandId = commandId;
	}

	public String getCommandName() {
		return commandName;
	}

	public void setCommandName(String commandName) {
		this.commandName = commandName;
	}

	public CommandType getCommandType() {
		return commandType;
	}

	public void setCommandType(CommandType commandType) {
		this.commandType = commandType;
	}

}
