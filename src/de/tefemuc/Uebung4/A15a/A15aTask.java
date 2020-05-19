package de.tefemuc.Uebung4.A15a;

/**
 * A simple task with a final description and a priority between 1 and 5
 */
public class A15aTask {

    private final String description;
    private int priority;

    /**
     * A simple task with a description and a custom priority
     * @param description Nonempty string as the description of the task, may not be changed after initialization
     * @param priority int as the priority of the task, will default to nearest allowed priority if outside of allowed interval
     */
    public A15aTask(String description, int priority){

        if(description.isEmpty()) throw new IllegalArgumentException("Description is empty");
        this.description = description;

        if (priority < 1){
            this.priority = 1;
        } else this.priority = Math.min(priority, 5);
    }

    /**
     * A simple task with a description and priority 1
     * @param description Nonempty string as the description of the task, may not be changed after initialization
     */
    public A15aTask(String description){

        if(description.isEmpty()) throw new IllegalArgumentException("Description is empty");
        this.description = description;

        this.priority = 1;
    }

    /**
     * Returns the description of the task
     * @return String with the description of the task
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the priority of the task
     * @return int between 1 and 5
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets a new priority between 1 and 5 for this task
     * @param priority int as the priority of the task, will default to nearest allowed priority if outside of allowed interval
     */
    public void setPriority(int priority) {
        if (priority < 1){
            this.priority = 1;
        } else this.priority = Math.min(priority, 5);
    }

    @Override
    public String toString(){
        return this.description + " (" + this.priority + ")";
    }

    @Override
    public boolean equals(Object o){
        if (o == null) return false;
        if (!o.getClass().equals(this.getClass())) return false;

        return ((A15aTask)o).getDescription().toLowerCase().equals(this.description.toLowerCase());
    }
}
