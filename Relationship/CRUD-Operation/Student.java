class Student {
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;

	//Student HAS-A Project
	private Project project;
	public 	Student() {

	}

	public Student(int id, String name, String mailId, long contactNumber) {
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}

	public int getId() {
		return id; 
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailId() {
		return mailId; 
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void displayStudentInfo() {
		System.out.println("Student Details");
		System.out.println("---------------");
		System.out.println("Id : " + getId());
		System.out.println("Name : " + getName());
		System.out.println("MailId : " + getMailId());
		System.out.println("Contact Number : " + getContactNumber());
		System.out.println();
	}

	public void createProject(Project project) {
		if(this.project == null && project != null) {
			this.setProject(project);
			System.out.println("Project is Created");
		} else {
			System.out.println("Project Not Created");
		}
	}

	public void readProject() {
		if(this.getProject() != null) {
			this.getProject().displayProjectInfo();
			System.out.println("Project Displayed");
		} else {
			System.out.println("Project Not Displayed");
		}
	}

	public void updateProject(int id,String name, String description) {
		if(id > 0 && name != null && description != null) {
			if(this.getProject().getId() == id) {
				this.getProject().setName(name);
				this.getProject().setDiscription(description);
				System.out.println("Project is Updated");
			} else {
				System.out.println("Project is not Updated");
			}
		}

		else {
			System.out.println("Invalid Data!");
		}
	}

	public void deleteProject(int id) {
		if(id > 0) {
			if(this.getProject().getId() == id) {
				this.setProject(null);
				System.out.println("Project is Deleted!");
			}
			else {
				System.out.println("Project is not Deleted");
			}
		}
		else {
			System.out.println("Invaild Data!");
		}
	}


}