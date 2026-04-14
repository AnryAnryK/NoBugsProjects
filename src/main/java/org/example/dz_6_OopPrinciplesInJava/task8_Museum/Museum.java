package org.example.dz_6_OopPrinciplesInJava.task8_Museum;

public class Museum {

	private Exhibit exhibit;

	public void setExhibit(Exhibit exhibit) {
		this.exhibit = exhibit;
	}

	public Exhibit getStory(Exhibit exhibit) {
		return exhibit;
	}

	public void manageExhibit(Exhibit exhibit) {
		this.exhibit = exhibit;
		System.out.println("===================================");
		exhibit.showInformationAboutExhibit();
		exhibit.storageConditions();
	}

	public static void main(String[] args) {

		Museum museum1 = new Museum();
		Exhibit manuscript1 = new Manuscript();
		museum1.setExhibit(manuscript1);
		museum1.manageExhibit(manuscript1);
		museum1.getStory(manuscript1).showInformationAboutExhibit(); // это уже - мой выпендрёж, просто было интересно получить доступ / вывести информацию разными способами, чего я и добился )

		Exhibit sculpture1 = new Sculpture();
		museum1.setExhibit(sculpture1);
		museum1.manageExhibit(sculpture1);
		museum1.getStory(sculpture1).showInformationAboutExhibit(); // это уже - мой выпендрёж, просто было интересно получить доступ / вывести информацию разными способами, чего я и добился )

	}
}
