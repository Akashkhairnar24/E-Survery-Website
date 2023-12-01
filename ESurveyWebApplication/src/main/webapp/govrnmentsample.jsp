<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Survey Form</title>

  <link rel="stylesheet" href="styles.css">
</head>

<body>
  <div class="container">
    <header class="header">
      <h1 id="title" class="text-center">Government E-Survey Form</h1>
      <p id="description" class="description text-center">
        Thank you for taking the time to help us improve the platform
      </p>
    </header>
    <form id="survey-form">
      <div class="form-group">
        <label id="name-label" for="name">Name</label>
        <input type="text" name="name" id="name" class="form-control" placeholder="Enter your name" required>
      </div>
      <div class="form-group">
        <label id="email-label" for="email">Email</label>
        <input type="email" name="email" id="email" class="form-control" placeholder="Enter your Email" required>
      </div>
      <div class="form-group">
        <label id="number-label" for="number">Age<span class="clue"></span></label>
        <input type="number" name="age" id="number" min="10" max="99" class="form-control" placeholder="Age">
      </div>
      <div class="form-group">
        <label id="number-label" for="number">Aadhar No.<span class="clue"></span></label>
        <input type="number" name="aadhar" id="number" min="10" max="99" class="form-control" placeholder="Aadhar (12-digit number)">
      </div>
      <div class="form-group">
        <label id="location-label" for="email">Location</label>
        <input type="email" name="location" id="locatiom" class="form-control" placeholder="Enter location" required>
      </div>
      <div class="form-group">
        <p>Which are the problems in your area?</p>
        <select id="dropdown" name="role" class="form-control" required>
          <option disabled selected value>Select options</option>
          <option value="student">Sanitary Problems</option>
          <option value="job">Road Construction Problem</option>
          <option value="learner">Mosquito Problems</option>
          <option value="water-problems">Water Problem</option>
          <option value="other">Other</option>
          <option value="no-problem">No Problem</option>
        </select>
      </div>

      <div class="form-group">
        <p>What would you recommend to make this problem clear?</p>
        <div class="form-group">
          <p>Describe in your words...</p>
          <textarea id="comments" class="input-textarea" name="comment"
            placeholder="Enter your comment here..."></textarea>
        </div>
      </div>

      <div class="form-group">
        <p>What are the difficulties faced in there with that situation?</p>
          <div class="form-group">
            <textarea id="comments" class="input-textarea" name="comment"
              placeholder="Type here..."></textarea>
          </div>
    
      </div>

      <div class="form-group">
        <p>
          What would you like to see improved in your area?
          <span class="clue">(Check all that apply)</span>
        </p>
        <label><input name="prefer" value="front-end-projects" type="checkbox" class="input-checkbox">Security</label>
        <label><input name="prefer" value="back-end-projects" type="checkbox" class="input-checkbox">Funding</label>
        <label><input name="prefer" value="data-visualization" type="checkbox" class="input-checkbox">Needed workers</label>
        <label><input name="prefer" value="challenges" type="checkbox" class="input-checkbox">Supervision</label>
        <label><input name="prefer" value="open-source-community" type="checkbox" class="input-checkbox">Materials requirement</label>
        <label><input name="prefer" value="gitter-help-rooms" type="checkbox" class="input-checkbox">Sustainable Management</label>
        <label><input name="prefer" value="videos" type="checkbox" class="input-checkbox">Other Help</label><br>
        <p>In case of other help please describe</p>
        <label><input name="describe" type="text"></label>
      </div>

      <div class="form-group">
        <p>Any comments or suggestions?</p>
        <textarea id="comments" class="input-textarea" name="comment"
          placeholder="Enter your comment here..."></textarea>
      </div>

      <div class="form-group">
        <button type="submit" id="submit" class="submit-button">
          Submit
        </button>
      </div>
    </form>
  </div>
</body>

</html>
