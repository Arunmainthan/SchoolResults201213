<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
<html>
<head>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(document).on('click', 'table#tableData th.sortable', function() {
			//Your code here
			var link = $(this).find("a").attr("href");
			$("div#resultsDisplayDiv").load(link);
			return false;
		});
		$(document).on('click', 'div#resultsDisplayDiv span.pagelinks', function(e) {
			//Your code here
			var link= e.target;
			var linkhref = $(link).attr("href");
			linkhref = linkhref.replace("displayAllResultsSort", "displayAllResults");
			$(link).attr("href",linkhref);
		});
		
		$('#filterBy').on('change', function() {
			window.location.href = "displayAllResults.action?filterBySubject=" + this.value;
			});
		
		$("div#resultsDisplayDiv span.pagelinks a").addClass("pagination");
		$("div.exportlinks a").addClass("export");
		$("table.basic_grid tr").each(function(){
			$(this).children(":first").addClass("blue");
		});

	});
</script>
<link href="../style.css" rel="stylesheet" type="text/css">
</head>
<body>

	<h2>Pinces School District</h2>

	<div id="uniqueSubjectsDiv">
		<s:select label="Filter By" headerKey="-1" headerValue="Select Filter"
			list="uniqueSubjects" name="filterBy" value="filterBySubject" />
	</div>
	<div id="resultsDisplayDiv">
		<jsp:include page="dataTable.jsp" />
	</div>



</body>
</html>