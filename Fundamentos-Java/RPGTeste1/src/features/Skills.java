package features;

import model.Abilities;

public class Skills extends Abilities{
	
	private int animalKen;
	private int drive;
	private int etiquette;
	private int firearms;
	private int melee;
	private int music;
	private int repair;
	private int security;
	private int stealth;
	private int survival;
	
	
	public Skills(int animalKen, int drive, int etiquette, int firearms, int melee, int music, int repair, int security,
			int stealth, int survival) {
		this.animalKen = animalKen;
		this.drive = drive;
		this.etiquette = etiquette;
		this.firearms = firearms;
		this.melee = melee;
		this.music = music;
		this.repair = repair;
		this.security = security;
		this.stealth = stealth;
		this.survival = survival;
	}


	public int getAnimalKen() {
		return animalKen;
	}
	public void setAnimalKen(int animalKen) {
		this.animalKen = animalKen;
	}
	public int getDrive() {
		return drive;
	}
	public void setDrive(int drive) {
		this.drive = drive;
	}
	public int getEtiquette() {
		return etiquette;
	}
	public void setEtiquette(int etiquette) {
		this.etiquette = etiquette;
	}
	public int getFirearms() {
		return firearms;
	}
	public void setFirearms(int firearms) {
		this.firearms = firearms;
	}
	public int getMelee() {
		return melee;
	}
	public void setMelee(int melee) {
		this.melee = melee;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getRepair() {
		return repair;
	}
	public void setRepair(int repair) {
		this.repair = repair;
	}
	public int getSecurity() {
		return security;
	}
	public void setSecurity(int security) {
		this.security = security;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getSurvival() {
		return survival;
	}
	public void setSurvival(int survival) {
		this.survival = survival;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Skills [animalKen=");
		builder.append(animalKen);
		builder.append(", drive=");
		builder.append(drive);
		builder.append(", etiquette=");
		builder.append(etiquette);
		builder.append(", firearms=");
		builder.append(firearms);
		builder.append(", melee=");
		builder.append(melee);
		builder.append(", music=");
		builder.append(music);
		builder.append(", repair=");
		builder.append(repair);
		builder.append(", security=");
		builder.append(security);
		builder.append(", stealth=");
		builder.append(stealth);
		builder.append(", survival=");
		builder.append(survival);
		builder.append("]");
		return builder.toString();
	}
	
}
