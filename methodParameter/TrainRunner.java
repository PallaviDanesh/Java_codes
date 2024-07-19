class TrainRunner{
		public static void main(String[]args){
			Train.book("Shivamogga","Bengaluru");
			Train.book("Shivamogga","Bengaluru",1);
			Train.book("Shivamogga","Bengaluru",1,285.91);
			Train.cancel(2134532);
			Train.cancel("Shivamogga","Bengaluru");
		}
}