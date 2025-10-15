package Student;
class student extends person{
	private String name,id,branch,password;
	student(String n){
		super(n);  //parent class constructor
		this.name=n; 
	}
	//getter method of encapsulation
	public void getId(String id){
		this.id=id;
	}
	public void getbranch(String branch){
		this.branch=branch;
	}
	public void getpassword(String password){
		this.password=password;
	}
	@Override
	public String getDetails(){
		return(id+","+name+","+branch+","+password);
	}
}
