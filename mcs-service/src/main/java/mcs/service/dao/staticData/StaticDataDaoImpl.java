package mcs.service.dao.staticData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import mcs.rest.dao.pojo.BreakdownPriority;
import mcs.rest.dao.pojo.Designations;
import mcs.rest.dao.pojo.Machines;
import mcs.rest.dao.pojo.Sections;

import org.springframework.jdbc.core.JdbcTemplate;

public class StaticDataDaoImpl implements StaticDataDao {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public ArrayList<Machines> getMachines(){
		String query = "select * from machines";
		ArrayList<Machines> machines = new ArrayList<Machines>();
	    List<Map<String,Object>> machinesRows = jdbcTemplate.queryForList(query);
        for(Map<String,Object> machineRow : machinesRows){
        	Machines machine = new Machines();
        	machine.setMachineId(String.valueOf(machineRow.get("machine_id")));
        	machine.setMachineName(String.valueOf(machineRow.get("machine_name")));
        	machine.setMahcineAltName(String.valueOf(machineRow.get("machine_alt_name"))) ;
        	machines.add(machine);
        }
        return machines;
    }
 
	public ArrayList<Sections> getSectons(){
		String query = "select * from sections";
		ArrayList<Sections> sections = new ArrayList<Sections>();
	    List<Map<String,Object>> sectionsRows = jdbcTemplate.queryForList(query);
        for(Map<String,Object> sectionRow : sectionsRows){
        	Sections section = new Sections();
        	section.setSectionId(String.valueOf(sectionRow.get("section_id")));
        	section.setSectionName(String.valueOf(sectionRow.get("section_name")));
        	section.setSectionAltName(String.valueOf(sectionRow.get("section_alt_name"))) ;
        	sections.add(section);
        }
        return sections;
    }

	public ArrayList<Designations> getDesignations(){
		String query = "select * from designations";
		ArrayList<Designations> designations = new ArrayList<Designations>();
	    List<Map<String,Object>> designationRows = jdbcTemplate.queryForList(query);
        for(Map<String,Object> designtionRow : designationRows){
        	Designations designaiton = new Designations();
        	designaiton.setName(String.valueOf(designtionRow.get("designation_name")));
        	designaiton.setAltName(String.valueOf(designtionRow.get("designation_alt_name"))) ;
        	designations.add(designaiton);
        }
        return designations;
    }

	public ArrayList<BreakdownPriority> getBrekadownPriority(){
		String query = "select * from breakdown_priority";
		ArrayList<BreakdownPriority> breakDownPrioirties = new ArrayList<BreakdownPriority>();
	    List<Map<String,Object>> priorityRows = jdbcTemplate.queryForList(query);
        for(Map<String,Object> priorityRow: priorityRows){
        	BreakdownPriority breakdownPriority = new BreakdownPriority();
        	breakdownPriority.setPriorityId(Integer.parseInt(String.valueOf(priorityRow.get("priority_id"))));
        	breakdownPriority.setPriorityLabel(String.valueOf(priorityRow.get("priority_label"))) ;
        	breakDownPrioirties.add(breakdownPriority);
        }
        return breakDownPrioirties;

	}
	
	}

