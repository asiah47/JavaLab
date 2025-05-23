public class Manager extends Person {

    private String favouredFormation;
    private double respect;
    private double ability;
    private double knowledge;
    private double belief;

    // CONSTRUCTORS
    public Manager(String firstName, String surname, String team, String favouredFormation,
                   double respect, double ability, double knowledge, double belief) {
        super(firstName, surname, team);
        this.favouredFormation = favouredFormation;
        this.respect = respect;
        this.ability = ability;
        this.knowledge = knowledge;
        this.belief = belief;
    }

    // GETTERS
    public String getFavouredFormation() {
        return favouredFormation;
    }
    public double getRespect() {
        return respect;
    }
    public double getAbility() {
        return ability;
    }
    public double getKnowledge() {
        return knowledge;
    }
    public double getBelief() {
        return belief;
    }

    // SETTERS
    public void setFavouredFormation(String favouredFormation) {
        this.favouredFormation = favouredFormation;
    }
    public void setRespect(double respect) {
        this.respect = respect;
    }
    public void setAbility(double ability) {
        this.ability = ability;
    }
    public void setKnowledge(double knowledge) {
        this.knowledge = knowledge;
    }
    public void setBelief(double belief) {
        this.belief = belief;
    }

}
