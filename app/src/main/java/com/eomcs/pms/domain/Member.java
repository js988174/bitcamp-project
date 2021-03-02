package com.eomcs.pms.domain;

import java.sql.Date;
import com.eomcs.util.CsvObject;

public class Member implements CsvObject{
  private int no;
  private String name;
  private String email;
  private String password;
  private String photo;
  private String tel;
  private Date registeredDate;

  public Member() {}

  public Member(String csv) {
    String fields[] = csv.split(",");
    this.setName(fields[0]);
    this.setEmail(fields[1]);  
    this.setPassword(fields[2]);
    this.setPhoto(fields[3]); 
    this.setTel(fields[4]);
    this.setRegisteredDate(Date.valueOf(fields[5]));
  }

  @Override
  public String toCsvString() {
    return String.format("%s,%s,%s,%s,%s\n",
        this.getName(),
        this.getEmail(),
        this.getPassword(),
        this.getPhoto(),
        this.getTel(),
        this.getRegisteredDate());
  }

  public static Member valueOfCsv(String csv) {
    String fields[] = csv.split(",");
    Member m = new Member();
    m.setName(fields[0]);
    m.setEmail(fields[1]);  
    m.setPassword(fields[2]);
    m.setPhoto(fields[3]); 
    m.setTel(fields[4]);
    m.setRegisteredDate(Date.valueOf(fields[5]));
    return m;

  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((email == null) ? 0 : email.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + no;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Member other = (Member) obj;
    if (email == null) {
      if (other.email != null)
        return false;
    } else if (!email.equals(other.email))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (no != other.no)
      return false;
    return true;
  }

  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getPhoto() {
    return photo;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  } 


}
