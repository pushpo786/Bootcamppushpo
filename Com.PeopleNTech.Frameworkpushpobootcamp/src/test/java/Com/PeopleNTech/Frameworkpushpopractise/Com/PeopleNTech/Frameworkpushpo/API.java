package Com.PeopleNTech.Frameworkpushpopractise.Com.PeopleNTech.Frameworkpushpo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
public class API {
  @Test
  public void f() {
	  Response status=get("https://reqres.in/api/users/2");
	  status.prettyPrint();
	  System.out.println(status.getStatusCode());
	  System.out.println(status.getTime());
  }
 @Test
  public void Post() {
File ti=new File(System.getProperty("user.dir")+"/Post.json");
Response dt=given().contentType(ContentType.JSON).body(ti).post("https://reqres.in/api/users");
dt.prettyPrint();
System.out.println(dt.getStatusCode());
System.out.println(dt.getTime());

 }
 @Test
 public void put() {
File pt=new File(System.getProperty("user.dir")+"/Post.json");
Response pi=given().contentType(ContentType.JSON).body(pt).put("https://reqres.in/api/users/2");
pi.prettyPrint();
System.out.println(pi.getStatusCode());
System.out.println(pi.getTime());
 }
 @Test
 public void delete() {
	 File lt=new File(System.getProperty("user.dir")+"/Post.json");
	 Response li=given().contentType(ContentType.JSON).body(lt).delete("https://reqres.in/api/users/2");
	 li.prettyPrint();
	 System.out.println(li.getStatusCode());
	 System.out.println(li.getTime());	 
 }
}