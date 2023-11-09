package com.example.talk.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected long id;
    @Column(name = "name")
    protected String name;
    @Column(name = "rrn")
    protected String rrn;
    @Column(name = "type")
    protected String type;
    @Column(name = "age")
    protected int age;
    @Column(name = "bankAccount")
    protected String bankAccount;
    @Column(name = "birthDate")
    protected Date birthDate;
    @Column(name = "gender")
    protected String gender;
    @Column(name = "password")
    protected String password;

    @Column(name = "phoneNum")
    protected String phoneNum;
    @Column(name = "occupation")
    protected String occupation;

    @Column(name = "email")
    private String email;


//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getBankAccount() {
//		return bankAccount;
//	}
//
//	public void setBankAccount(String bankAccount) {
//		this.bankAccount = bankAccount;
//	}
//
//	public Date getBirthDate() {
//		return birthDate;
//	}
//
//	public void setBirthDate(Date birthDate) {
//		this.birthDate = birthDate;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getPhoneNum() {
//		return phoneNum;
//	}
//
//	public void setPhoneNum(String phoneNum) {
//		this.phoneNum = phoneNum;
//	}
//
//	public String getRrn() {
//		return rrn;
//	}
//
//	public void setRrn(String rrn) {
//		this.rrn = rrn;
//	}
//
//	public String getOccupation() {
//		return occupation;
//	}
//
//	public void setOccupation(String occupation) {
//		this.occupation = occupation;
//	}


//
//	public boolean filloutInfo(BufferedReader inputReader) throws IOException {
//		System.out.println("-----회원가입정보 입력하기-----");
//		//Name
//		System.out.print("1. 이름을 입력하세요: ");
//		String customerName = inputReader.readLine().trim();
//		this.setName(customerName);
//		//Gender
//		System.out.print("2. 성별을 선택하세요 \n1. 남성 \n2. 여성 \n>");
//		String customerGender = inputReader.readLine().trim();
//		if(customerGender.equals("1")) this.setGender("남성");
//		if(customerGender.equals("2")) this.setGender("여성");
//		//BirthDate
//		System.out.print("3. 생년월일을 입력하세요 (예시: 2000-01-01): ");
//		String birthDateString = inputReader.readLine().trim();
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			Date birthDate = format.parse(birthDateString);
//			this.setBirthDate(birthDate);
//		} catch (ParseException e) {
//			throw new RuntimeException(e);
//		}
//		//RRN
//		System.out.print("4. 주민등록번호를 입력하세요 (예시: 000101-1111111): ");
//		String rrn = inputReader.readLine().trim();
//		this.setRrn(rrn);
//		//PhoneNum
//		System.out.print("5. 휴대폰 번호를 입력하세요 (예시: 01012341234): ");
//		String phoneNum = inputReader.readLine().trim();
//		this.setPhoneNum(phoneNum);
//		//Occupation
//		System.out.print("6. 직업을 입력하세요 (예시: 자동차 정비사): ");
//		String occupation = inputReader.readLine().trim();
//		this.setOccupation(occupation);
//		//BankAccount
//		System.out.print("7. 계좌번호를 입력하세요 (예시: 29933422110583): ");
//		String bankAccount = inputReader.readLine().trim();
//		this.setBankAccount(bankAccount);
//
//		return true;
//	}
//
//	public HashMap<String,String> getInfo(){
//		return null;
//	}
//
//	public String showAd(){
//		return "";
//	}
//
//	public boolean showInsurances(){
//		return false;
//	}
//
//	public boolean receiveMessage(String message){
//		System.out.println("\n******** "+this.getName()+" 고객의 화면 ********");
//		System.out.println(message);
//		return true;
//	}
//
//
//	public HashMap<String, String> submitDocs(ArrayList<String> requiredDocs){
//		return null;
//	}

}