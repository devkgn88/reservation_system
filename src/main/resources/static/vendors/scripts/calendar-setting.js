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
	  slotMaxTime:"18:00:00",
	  slotLabelInterval:"00:30",
	  locale:'ko',
	  buttonText:{
		today:'오늘',
		month:'월간',
		week:'주간',
		day:'일간'
	  },
	  timeZone : 'local',
	  businessHours: {
	    daysOfWeek: [ 1, 2, 3, 4, 5 ], // Monday - Thursday

	    startTime: '09:00', // a start time (10am in this example)
	    endTime: '18:00', // an end time (6pm in this example)
	  },
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
			title: '[GDJ82] 1팀',
	        start: '2024-09-03T11:00:00',
	        end: '2024-09-03T11:30:00',
	        description: '홍길동, 김민수, 이영희, 김철수, 홍길순',
	        backgroundColor:'#F09EA7',
	        borderColor:'#F09EA7',
	        textColor:'#131e22'
       },
	   {
		 title:'국군의 날',
	     start: '2024-10-01',
	     end: '2024-10-02',
	     overlap: false,
	     display: 'background',
		 backgroundColor:'#ff00007d',
	   },
	   {
   		 title:'추석',
   	     start: '2024-09-15',
   	     end: '2024-09-19',
   	     overlap: false,
   	     display: 'background',
   		 backgroundColor:'#ff00007d',
   	   },
	   {
  		 title:'개천절',
  	     start: '2024-10-03',
  	     end: '2024-10-03',
  	     overlap: false,
  	     display: 'background',
  		 backgroundColor:'#ff00007d',
  	   },
	   {
 		 title:'한글날 어린이날',
 	     start: '2024-10-09',
 	     end: '2024-10-09',
 	     overlap: false,
 	     display: 'background',
 		 backgroundColor:'#ff00007d',
 	   }
	  ]
	  
	});
	calendar.render();
});