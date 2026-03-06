class JavaApplication{
	public static void execute() {
		Student s1 = new Student(3,"Vivek","vivek@gmail.com",9876543210l);
		s1.diplayStudentInfo();

		Project p1 = new Project(1,"Calorie Tracker","Created by using Java SprintBoot");
		// p1.diplayProjectInfo();

		//Student will Created a New Project
		student.createProject(Project);

		//Student will Read the created project
		student.readProject();

		//Student will Updated the Existing Project
		student.updateProject(1,"Banking System","Created by using JavaScript");

		//Student will Delete the Project
		student.deleteProject(1);


	}
}