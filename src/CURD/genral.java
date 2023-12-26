package CURD;

@RequestMapping("/controller")

public class genral {
	@AutoWired
	private ServiceCourse servicecourse;

	@Postmapping("/course")

	public ResponseEntity<String> PostCourse(@RequestBody Course course) {
		String status = servicecourse.upSet(course);
		return new ResponseEntity<>(status, HttPStatus.CREATED);
	}

	@Getmapping("/course/{cid}")
	public ResponseEntity<course> getCourse(@pathVariable Integer cid) {
		course status = servicecourse.getById(cid);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	public static void main(String[] args) {

	}
	@Autowired
	private CourseService courseservice;
	@GetMapping("/course/{cid}")
	public ResponseEntity<Course>getCourse(@PathVariable Integer cid);
	    			Course status= courseservice.getById(cid);
	    			return new ResponseEntity<>(status,httpStatus.OK);  
}
@DeleteMapping("/course/{cid}")
public ResponseEntity<String>deleteCourse(@PathVariable Integer cid){
	String course=courseservice.deleteById(cid);
	return new ResponseEntity<>(course,HttpStatus.OK)
	
}
@Autowired
private CourseService courseservice;
@RequestMapping("/course")
public ResponseEntity<String>insertcourse(@RequestBody Course course){
	String status=courseservice.upSet(course);
	return new ResponseEntity<>(status,HttpStatus.CREATED);
	
}

@Autowired
private CourseService courseservice;
@PostMapping("/course")
public ResponseEntity<String> insertCourse(@RequestBody Course course){
	String<> status=courseservice.upset(course);
	return new ResponseEnitity<>(status,HttpStatus.CREATE);
}

@GetMapping("/course")
public ResponseEntity<List<Course>>getCourse(@RequestBody Course  course){
	List<Course> status=courseservice.getCourse(course);
	return new ResponseEntity<>(status,HttpStatus.OK);
	
}
@GetMapping("/course/{cid}")
public ResponseEntity<Course> getCourse(@PathVariable Integer cid) {
Course status=	courseservice.getById();
	
}
}

















