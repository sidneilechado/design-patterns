public class HttpServer {
	private UserRepository userRepository;
	private PetRepository petRepository;
	
	public void init() {
		userRepository = new UserRepository();
		petRepository = new PetRepository();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response){
		String action = request.getServletPath();

		try {
			switch (action) {
				case "/user/create":
					createUser(request, response);
					break;
				case "/pet/create":
					createUser(request, response);
					break;
				default:
					getUser(request, response);
					break;
			}
	}

	private void createUser(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		User newUser = new User(name, email, country);
		userRepository.create(newUser);
		response.sendRedirect("list");
	}

	private void getUser(HttpServletRequest request, HttpServletResponse response){
		User user = userRepository.get(request.getParameter("id"));
		request.setAttribute("user", user);
		response.sendRedirect("home");
	}

		private void createPet(HttpServletRequest request, HttpServletResponse response){
		User user = userRepository.get(request.getParameter("id"));
		userRepository.create(newUser);
		response.sendRedirect("list");
	}
}
