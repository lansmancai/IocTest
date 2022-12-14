package person;

public class Teacher
{
	private Student stu;
	
	//默认的无参数构造器
	public Teacher(){}

	//重写toString()函数
	public String toString()
	{
		return "stu:" + stu;
	}
	public void setStu(Student st)
	{

		this.stu = st;
	}
}
