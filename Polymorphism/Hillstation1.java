package com.day4;
class Hillstation1
	{
		public void location()
		{
			System.out.println("Hillstation.");
		}
				
		public void famousfor()
				
		{
			System.out.println("Famous for its weather and views.");
		}
		
		public static void main(String[] args)
		{
		//	Main m = new Main();
			
			Gulmarg gm = new Gulmarg();
			
			gm.location();
			gm.famousfor();
					
		}

	
	}

	class Manali extends Hillstation1
	{
		public void location()
		{
			System.out.println("Manali");
			
		}
		
		public void famousfor()
		{
			System.out.println("Manali is famous for snow-capped mountains, adventure sports, and scenic beauty.");
			super.location();
			super.famousfor();
		}
	}
	

	class Mussoorie extends Manali
	{
		public void location()
		{
			System.out.println("Mussoorie.");
			
		}
		
		public void famousfor()
		{
			System.out.println("Mussoorie is famous for its colonial architecture, scenic views, and pleasant weather.");
			super.location();
			super.famousfor();
		}
	}
	

	class Gulmarg extends Mussoorie
	{
		public void location()
		{
			System.out.println("Gulmarg.");
			
		}
		
		public void famousfor()
		{
			System.out.println("Gulmarg is famous for its gondola rides, skiing, and meadows.");
			super.location();
			super.famousfor();
		}

	}
	
		



