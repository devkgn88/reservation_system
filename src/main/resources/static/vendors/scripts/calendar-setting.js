document.addEventListener('DOMContentLoaded', function() {
	var calendarEl = document.getElementById('calendar');
	var calendar = new FullCalendar.Calendar(calendarEl, {
	  initialView: 'dayGridMonth',
	  initialDate: '2024-09-01',
	  headerToolbar: {
	      left: 'prev,next',
	      center: 'title',
	      right: 'dayGridMonth,dayGridWeek,timeGridDay' // user can switch between the two
	    },
      allDaySlot:false,
	  slotMinTime:"09:00:00",
	  slotMaxTime:"18:30:00",
	  slotLabelInterval:"00:30",
	  locale:'ko',
	  buttonText:{
		today:'오늘',
		month:'월간',
		week:'주간',
		day:'일간'
	  },
	  timeZone : 'local',
	  eventDidMount: function(info) {
        var tooltip = new Tooltip(info.el, {
          title: info.event.extendedProps.description,
          placement: 'top',
          trigger: 'hover',
          container: 'body'
        });
      },
	  events:[
		{
		  title: 'All Day Event',
		  description: 'description for All Day Event',
		  start: '2024-09-10'
		}		
	  ]
	  
	});
	calendar.render();
});