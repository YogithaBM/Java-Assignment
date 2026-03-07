class Trainer{
    String trainerName;
    String specialization;
	
    Trainer(String trainerName,String specialization){
        this.trainerName=trainerName;
        this.specialization=specialization;
    }
    void displayTrainer() {
        System.out.println("Trainer Name: "+trainerName);
        System.out.println("Specialization: "+specialization);
    }
}