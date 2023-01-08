package example;

import javax.persistence.*;

@Entity
@Table(name="view_filter")
@NamedQueries({
  @NamedQuery(name = "findByType",
    query = "from Filter where typeFilter = :filterType order by name")
})
public class Filter
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String color;
  String name;

  @Column(name="type_filter")
  Integer typeFilter;

  public Filter(){}

  public Filter(Long id, String color, String name, Integer typeFilter ){}

  public Long getId(){return id;}

  public String getColor() { return color; }

  public String getName(){ return name;}

  public Integer getTypeFilter(){return typeFilter;}

  public void setId(Long value){id = value;}

  public void setColor(String value) { color = value; }

  public void setName(String value){ name = value;}

}
