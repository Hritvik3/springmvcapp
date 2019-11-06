$(function(){
	 
	//for solving the active menu problem
	
	switch(menu){
	case 'About Us':  $('#about').addClass('active');
	break;
	case 'Contact Us':  $('#contact').addClass('active');
	break;
	case 'All Products':  $('#listProducts').addClass('active');
	break;
	default :
		if(menu == "Home") break;
	  $('#listProducts').addClass('active');
	$('#a_'+menu).addClass('active');
	break;
	
	}
	
	// code for jquery datatable
	//create a dataset
	var products = [
			['1','ABC'],
			['2','htg'],
			['3','AJK'],
			['4','ASD'],
			['5','ABX'],
			['6','ABV'],
			['7','ABD'],
			['8','ABF'],
			['9','ABh'],
			['10','Adg']
			
	];
		
		var $table = $('#productListTable');
		
		//execute the below code only when we have this table
		
		if($table.length){
			$table.DataTable({
				lengthMenu: [[3,5,10,-1], ['3 Records', '5 Records', '10 Records' , 'all']],
				
				data: products
			});

		}
	
	
	
	
	
})