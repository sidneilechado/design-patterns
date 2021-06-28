public class HttpServer {
	private final EntityManager entityManager;

	protected void doGet(HttpServletRequest request, HttpServletResponse response){
		String action = request.getServletPath();

		switch (action) {
			case "/create":
				createUser(request, response);
				break;
			default:
				listUsers(request, response);
				break;
		}
	}

	private void createUser(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		User newUser = new User(name, email, country);
		entityManager.persist(user);
		response.sendRedirect("list");
	}

	private void listUsers(HttpServletRequest request, HttpServletResponse response){
		List<User> listUser = entityManager.find();
		request.setAttribute("listUser", listUser);
		response.sendRedirect("list");
	}
}
