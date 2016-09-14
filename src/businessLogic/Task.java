package businessLogic;

import java.util.Date;

public class Task {
	
	private Date initialTimestamp;
	private Date finalTimestamp;
	private String taskName;
	private boolean start;
	private boolean end;
	
	public Task()
	{
		initialTimestamp = new Date();
		finalTimestamp = new Date();
		taskName = "";
		start = false;
		end = false;
	}
	
	public Task(Date init, Date finalDate, String name)
	{
		initialTimestamp = (Date) init.clone();
		finalTimestamp = (Date) finalDate.clone();
		taskName = name;
		start = false;
		end = false;
	}
	
	public Task(Date init, Date finalDate)
	{
		initialTimestamp = (Date) init.clone();
		finalTimestamp = (Date) finalDate.clone();
		taskName = "";
		start = false;
		end = false;
	}
	
	public Task(Task t)
	{
		initialTimestamp = t.getInitialTimestamp();
		finalTimestamp = t.getFinalTimestamp();
		taskName = t.getTaskName();
		start = t.start;
		end = t.end;
	}
	
	public Date getInitialTimestamp()
	{
		return (Date) initialTimestamp.clone();
	}
	
	public Date getFinalTimestamp()
	{
		return (Date) finalTimestamp.clone();
	}
	
	public String getTaskName()
	{
		return taskName;
	}
	
	public void setInitialTimestamp(Date init)
	{
		if(init != null)
			initialTimestamp = (Date) init.clone();
	}
	
	public void setFinalTimestamp(Date fin)
	{
		if(fin != null)
			initialTimestamp = (Date) fin.clone();
	}
	
	public void setTaskName(String name)
	{
		taskName = name;
	}
	
	public long getDurationInMinutes()
	{
		return (finalTimestamp.getTime() - initialTimestamp.getTime())/(1000*60);
	}
	
	public void startTask()
	{
		if(!start)
			start = true;
	}
	
	public void endTask()
	{
		if(!end)
			end = true;
	}
	

}
