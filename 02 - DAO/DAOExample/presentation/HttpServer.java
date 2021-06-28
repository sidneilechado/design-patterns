public class HttpServer {
	private UserDAO userDAO;
	
	public void init() {
		userDAO = new UserDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response){
		String action = request.getServletPath();

		try {
			switch (action) {
				case "/create":
					createUser(request, response);
					break;
				default:
					listUser(request, response);
					break;
			}
	}

	private void createUser(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		User newUser = new User(name, email, country);
		userDAO.create(newUser);
		response.sendRedirect("list");
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response){
		List<User> listUser = userDAO.selectAllUsers();
		request.setAttribute("listUser", listUser);
		response.sendRedirect("list");
	}
}
