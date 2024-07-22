class CountryyRunner
{
	public static void main(String[] args)
	{
		
		System.out.println("Running main CountryRunner");
		String[] stateNames={"AP","Arunachal pradesh","Assam","bihar","chhattisgarh","Goa","gujrath","Haryana","Himachal pradesh","jharkhand","KARNATAKA","Kerala","MP","maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","sikkim","TN","Telangana","tripura","Uttarakhand","UP","West bengal"};
        Country.states(stateNames);
		
		int[] codes={29,30,31,32,28,01,02,03,04,05};
		Country.pins(codes);
		
		String[] names={"Jawaharlal Nehru","Gulzarilal Nanda","Lal Bahadur Shastri","Gulzarilal Nanda", "Indira Gandhi Morarji", "Desai Charan Singh", "Indira Gandhi", "Rajiv Gandhi","Vishwanath Pratap Singh", "Chandra Shekhar", "P.V. Narasimha Rao ","Atal Bihari Vajpayee","  H.D. Deve Gowda","I.K. Gujral","Atal Bihari Vajpayee",  "Manmohan Singh","Narendra Modi"};
         Country.prime(names);
		 
		String[] ministers = {"Rajnath Singh", "Amit Shah", "Nirmala Sitharaman", "Subrahmanyam Jaishankar", "Nitin Gadkari", "Smriti Irani", "Prakash Javadekar", "Piyush Goyal", "Dharmendra Pradhan", "Mukhtar Abbas Naqvi","Harsimrat Kaur Badal", "Thawar Chand Gehlot", "Ravi Shankar Prasad", "Harsh Vardhan", "Arjun Munda", "Narendra Singh Tomar", "Ramesh Pokhriyal Nishank", "Mahendra Nath Pandey", "Gajendra Singh Shekhawat","Giriraj Singh", "Prahlad Joshi", "Narayan Tatu Rane", "Sarbananda Sonowal", "Ashwini Vaishnaw","Bhupender Yadav", "Parshottam Rupala", "G Kishan Reddy", "Anurag Thakur", "Hardeep Singh Puri", "Mansukh Mandaviya" };
        Country.cabinetMinisters(ministers);
		
		String[] politics={"BJP","Congress","JDS","Others","KJP"};
		Country.parties(politics);
	}
	
}