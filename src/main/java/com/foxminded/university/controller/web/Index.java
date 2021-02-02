package com.foxminded.university.controller.web;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.foxminded.university.controller.repository.ClassroomRepository;
import com.foxminded.university.controller.repository.CourseRepository;
import com.foxminded.university.controller.repository.GroupRepository;
import com.foxminded.university.controller.repository.TeacherRepository;
import com.foxminded.university.controller.repository.TimetableRepository;
import com.foxminded.university.model.Course;
import com.foxminded.university.model.DateInterval;
import com.foxminded.university.model.Group;
import com.foxminded.university.model.Student;
import com.foxminded.university.model.Teacher;
import com.foxminded.university.model.Timetable;

@Controller
public class Index {
    @Autowired
    ClassroomRepository classroomRepo;
    @Autowired
    TeacherRepository teacherRepo;
    @Autowired
    TimetableRepository timetableRepo;
    @Autowired
    CourseRepository courseRepo;
    @Autowired
    GroupRepository groupRepo;
    
    @RequestMapping("/")
   // @Transactional
    public String loadIndexPage(Model model) {
        return "index";
    }
}
