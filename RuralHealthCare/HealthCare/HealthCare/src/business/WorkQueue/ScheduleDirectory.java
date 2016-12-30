/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Anil
 */
public class ScheduleDirectory {
    private ArrayList<Schedule> scheduleList;
    
    public ScheduleDirectory()
    {
        scheduleList = new ArrayList<Schedule>();
    }

    public ArrayList<Schedule> getScheduleList() {
        return scheduleList;
    }
    
    public Schedule add()
    {
        Schedule s = new Schedule();
        scheduleList.add(s);
        return s;
    }
    
    public void cancelSchedule(Schedule schedule)
    {
        scheduleList.remove(schedule);
    }
}
