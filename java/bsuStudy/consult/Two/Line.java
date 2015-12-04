class Line{
	Point beginLine;
	Point endLine;
	double lineLength(){
		double length=Math.sqrt((beginLine.x-endLine.x)*(beginLine.x-endLine.x)+(beginLine.y-endLine.y)*(beginLine.y-endLine.y));
		return length;
	}
}