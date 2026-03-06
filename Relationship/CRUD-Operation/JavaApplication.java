class JavaApplication{
	public static void execute() {
		Student s1 = new Student(3,"Vivek","vivek@gmail.com",9876543210l);
		s1.displayStudentInfo();

		Project p1 = new Project(1,"Calorie Tracker","Created by using Java SprintBoot");
		// p1.diplayProjectInfo();

		//Student will Created a New Project
		s1.createProject(p1);

		//Student will Read the created project
		s1.readProject();

		//Student will Updated the Existing Project
		s1.updateProject(1,"Banking System","Created by using JavaScript");

		//Student will Delete the Project
		s1.deleteProject(1);


	}
}