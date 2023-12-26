package CURD;

public class SpringBootCurdOperations {

	@Autowired
	private CourseService courseService;
	@PostMapping("/course")
	public ResponseEntity<String>createCourse(@RequestBody Course course){
		String insert=courseServic.upSet(course);
		return new ResponseEntity<>(insert,HttpStatus.CREATE);
	}
	@GetMapping("/course/{cid}")
	public ResponseEntity<course>getCourse(@Pathvariable Integer cid){
		course status=courseService getById(cid);
		return new ResponseEntity(status,HttapStatus.OK);
		
	}
	@Getmapping("/course")
	public ResponseEntity<List<course>>getAll(){
		List<course> course=courseService.GetAllCourse();
		return new ResponseEntity<>(course,HttapStatus.OK);
	}
	@PostMapping("/course")
	public ResponseEntity<String>insertCourse(@RequestBody Course course){
		String status=CourseService.upset(course);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}
	
	

}
