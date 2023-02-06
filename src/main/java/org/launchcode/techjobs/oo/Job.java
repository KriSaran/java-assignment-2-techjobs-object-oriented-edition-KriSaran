package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
       // this.id = id;
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public String toString(){
      if(getName()==null&&getEmployer()==null&&getLocation()==null&&getPositionType()==null&&getCoreCompetency()==null) {
//          return "\n" + "ID : __________" + "\n" +
//                  "Name : __________" + "\n" +
//                  "Employer : __________" + "\n" +
//                  "Location : __________" + "\n" +
//                  "Position Type : __________" + "\n" +
//                  "Core Competency : __________" + "\n";

          //this.id=this.id-1;
          return "OOPS! This job does not seem to exist.";
      }
      else {
          String test2;
          String test3 = "Data Not Available" + "\n";

          if (getId() != 0) {
              test2 = "\n"+"ID: " + getId() + "\n";
          } else {
              test2 = "ID: " + test3;
          }

          if (getName() ==null) {
              test2 += "Name: ____________";// + getName() + "\n";
          } else {
              if(getName().isEmpty()) {
                  test2 += "Name: " + test3;
              }else {
                  test2 +="Name: "+getName()+"\n";
              }
          }

          if (employer==null||employer.getValue() == null) {
              test2+="Employer : __________" + "\n" ;
          } else {
              if(!employer.getValue().isEmpty()){
              test2 += "Employer: " + employer.getValue() + "\n";}
              else {
               test2 += "Employer: " + test3;
              }
          }
          if (location==null||location.getValue() == null) {
              test2+="Location : _________" + "\n" ;
          } else {
              if(!location.getValue().isEmpty()){
                  test2 += "Location: " + location.getValue() + "\n";}
              else {
                  test2 += "Location: " + test3;
              }
          }
          if (positionType==null||positionType.getValue() == null) {
              test2+="Position Type : _________" + "\n" ;
          } else {
              if(!positionType.getValue().isEmpty()){
                  test2 += "Position Type: " + positionType.getValue() + "\n";}
              else {
                  test2 += "Position Type: " + test3;
              }
          }
          if (coreCompetency==null||coreCompetency.getValue() == null) {
              test2+="Core Competency : _________" + "\n" ;
          } else {
              if(!coreCompetency.getValue().isEmpty()){
                  test2 += "Core Competency: " + coreCompetency.getValue() + "\n";}
              else {
                  test2 += "Core Competency: " + test3;
              }
          }
          return test2;
      }
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(!(obj instanceof Job))return false;
        Job job=(Job)obj;
        return getId()== job.getId();
    }

    @Override
    public int hashCode(){
        return Objects.hash(getId());
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return this.employer;
    }

    public Location getLocation() {
        return this.location;
    }

    public PositionType  getPositionType() {
        return this.positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return this.coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
