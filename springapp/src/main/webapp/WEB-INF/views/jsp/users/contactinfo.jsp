<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header.jsp" />

<spring:url value="/users/add" var="urlHome" />

<div class="container">

	<h1>
		<spring:message code="addContact" />
	</h1>
	<br />

	<spring:url value="/contact" var="contactActionUrl" />

	<form:form class="form-horizontal" method="post"
		modelAttribute="contactForm" action="${contactActionUrl}">

		<spring:bind path="name">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Name</label>
				<div class="col-sm-10">
					<form:input path="name" type="text" class="form-control " id="name"
						placeholder="Name" />
					<form:errors path="name" class="control-label" />
				</div>
			</div>
		</spring:bind>

		<spring:bind path="address">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Address</label>
				<div class="col-sm-10">
					<form:textarea path="address" rows="5" class="form-control"
						id="address" placeholder="Address" />
					<form:errors path="address" class="control-label" />
				</div>
			</div>
		</spring:bind>

		<spring:bind path="city">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">City</label>
				<div class="col-sm-10">
					<form:input path="city" type="text" class="form-control " id="city"
						placeholder="City" />
					<form:errors path="city" class="control-label" />
				</div>
			</div>
		</spring:bind>

		<spring:bind path="state">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">State</label>
				<div class="col-sm-5">
					<form:select path="state" class="form-control">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${stateList}" />
					</form:select>
					<form:errors path="state" class="control-label" />
				</div>
				<div class="col-sm-5"></div>
			</div>
		</spring:bind>

		<spring:bind path="zip">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Zip</label>
				<div class="col-sm-10">
					<form:input path="zip" type="text" class="form-control " id="zip"
						placeholder="Zip" />
					<form:errors path="zip" class="control-label" />
				</div>
			</div>
		</spring:bind>

		<spring:bind path="occupation">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Occupation</label>
				<div class="col-sm-10">
					<form:input path="occupation" type="text" class="form-control "
						id="occupation" placeholder="Occupation" />
					<form:errors path="occupation" class="control-label" />
				</div>
			</div>
		</spring:bind>

		<spring:bind path="gender">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Gender</label>
				<div class="col-sm-10">
					<label class="radio-inline"> <form:radiobutton
							path="gender" value="M" /> Male
					</label> <label class="radio-inline"> <form:radiobutton
							path="gender" value="F" /> Female
					</label> <br />
					<form:errors path="gender" class="control-label" />
				</div>
			</div>
		</spring:bind>


		<spring:bind path="phone">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Phone#</label>
				<div class="col-sm-10">
					<form:input path="phone" class="form-control" id="phone"
						placeholder="Phone" />
					<form:errors path="phone" class="control-label" />
				</div>
			</div>
		</spring:bind>


		<spring:bind path="email">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Email</label>
				<div class="col-sm-10">
					<form:input path="email" class="form-control" id="email"
						placeholder="Email" />
					<form:errors path="email" class="control-label" />
				</div>
			</div>
		</spring:bind>

		<spring:bind path="guardian">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Guardian</label>
				<div class="col-sm-10">
					<div class="checkbox">
						<label> <form:checkbox path="guardian" id="guardian" />
						</label>
						<form:errors path="guardian" class="control-label" />
					</div>
				</div>
			</div>
		</spring:bind>


		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<a class="btn btn-primary" href="${urlHome}" role="button">Previous</a>
				<button type="submit" class="btn btn-primary pull-right">Next</button>
			</div>
		</div>
	</form:form>

</div>

<jsp:include page="../fragments/footer.jsp" />

</body>
</html>