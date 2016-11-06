package lesson1.part2;

public class Entertainments 
{
	private String form;
	private String type;
	private String safety;
	private String audience;
	protected String activity;
	
			
			//CONSTRUCTORs//
			
	public Entertainments(){}
	
	public Entertainments(String form, String type, String safety, String audience, String activity)
	{
		this.form = form;
		this.type = type;
		this.safety = safety;
		this.audience = audience;
		this.activity = activity;
	}
			
	public String getForm() 
	{
		return form;
	}
	public void setForm(String form) 
	{
		this.form = form;
	}
	
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public String getSafety() 
	{
		return safety;
	}
	public void setSafety(String safety) 
	{
		this.safety = safety;
	}
	
	public String getAudience() 
	{
		return audience;
	}
	public void setAudience(String audience) 
	{
		this.audience = audience;
	}
	
	public String getActivity() 
	{
		return activity;
	}
	public void setActivity(String activity) 
	{
		this.activity = activity;
	}

	public static void main(String[] args)
	{
		Entertainments concertKobzone = new Entertainments("Concert", "Public, live action ", "Safe", "With audience", "Not active");
		System.out.println("Form of entertainments is: " + concertKobzone.getForm());
		System.out.println("Type of entertainments is: " + concertKobzone.getType());
		System.out.println("Is entertainments safe?: " + concertKobzone.getSafety());
		System.out.println("Has a entertainments  an audience or not?: " + concertKobzone.getAudience());
		System.out.println("Is entertainments active or not?: " + concertKobzone.getActivity());
	}
	
}


/*
public void perform() {}
public void start() {}
public void finish() {}



*/