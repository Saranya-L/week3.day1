package assignment5;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation ml=new Automation();
		ml.selenium();
		ml.java();
		ml.ruby();
		ml.python();

	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby is an interpreted, high-level, general-purpose programming language which supports multiple programming paradigms.");
	}

}
