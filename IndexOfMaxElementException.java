class IndexOfMaxElementException extends Exception {

	private String message;
	
	public IndexOfMaxElementException(String message) {
		this.message = message;
	}

	public String toString() {
		return "Tested failed: " + message;
	}
}