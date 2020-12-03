<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jsp"%>
<div class="container">

 <div class="panel panel-primary">
     <div class="panel-heading">Employes Page > <b>
	     <c:choose>
	     	<c:when test="${employe.id!=null }">Edit</c:when>
	     	<c:otherwise>Add</c:otherwise>
	   	</c:choose>
	   	</b>
   	</div>
        <div class="panel-body">
           
			<form:form method="post" modelAttribute="employe">
				<form:hidden path="id" />
				<c:if test="${employe.id != null && error == null }">
					<fieldset class="form-group">
						<form:label path="id">Id </form:label>
						<form:input path="id" type="text" class="form-control"  required="required" />
						<form:errors path="id" cssClass="text-warning" />
					</fieldset>
				</c:if>
				<fieldset class="form-group">
					<form:label path="name">Nom</form:label>
					<form:input path="name" type="text" class="form-control" required="required" />
					<form:errors path="name" cssClass="text-warning" />
				</fieldset>
				<fieldset class="form-group">
					<form:label path="surname">Surname</form:label>
					<form:input path="surname" type="text" class="form-control" required="required" />
					<form:errors path="surname" cssClass="text-warning" />
				</fieldset>
				<fieldset class="form-group">
					<form:label path="function">Function</form:label>
					<form:input path="function" type="text" class="form-control" required="required" />
					<form:errors path="function" cssClass="text-warning" />
				</fieldset>
				
				<button onclick="history.back()" type="button" class="btn btn-default"><i class="fa fa-arrow-left"></i> Back</button>
				<button type="submit" class="btn btn-success"><i class="fa fa-save"></i> Save</button>
				
				<c:if test="${error != null}">
					<span class="text-danger">${error}</span>
				</c:if>
			</form:form>
        </div>
        
     </div>
 </div>
 
<%@ include file="../common/footer.jspf"%>