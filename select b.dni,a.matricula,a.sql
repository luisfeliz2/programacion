s

select dep.dept_name,concat(left(emp.first_name,3),".",right(emp.last_name,3)) ext_empleado,sal.salary from departments dep join dept_manager dep_man on dep_man.dept_no = dep.dept_no 
join employees emp on  emp.emp_no= dep_man.emp_no join salaries sal on sal.emp_no = emp.emp_no where sal.salary > 100000 ;


select concat(emp.first_name,emp.last_name) emp,sal.salary from employees emp join salaries sal on  