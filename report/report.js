$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Md Shamibur Rahman/eclipse-workspace/FacebookLogin/facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Test",
  "description": "",
  "id": "facebook-test",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "open browser",
  "rows": [
    {
      "cells": [
        "chrome"
      ],
      "line": 5
    },
    {
      "cells": [
        "firefox"
      ],
      "line": 6
    },
    {
      "cells": [
        "safari"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "nevigate to URl",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.open_browser(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.nevigate_to_URl()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 10,
  "name": "valid credential",
  "description": "",
  "id": "facebook-test;valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user type userId and password",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should see his profile page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_type_userId_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_should_see_his_profile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "invalid credential",
  "description": "",
  "id": "facebook-test;invalid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@reg"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user type \u003cuserId\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user should not see his profile page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "facebook-test;invalid-credential;",
  "rows": [
    {
      "cells": [
        "userId",
        "password"
      ],
      "line": 26,
      "id": "facebook-test;invalid-credential;;1"
    },
    {
      "cells": [
        "\"user1\"",
        "\"1234\""
      ],
      "line": 27,
      "id": "facebook-test;invalid-credential;;2"
    },
    {
      "cells": [
        "\"user2\"",
        "\"1235\""
      ],
      "line": 28,
      "id": "facebook-test;invalid-credential;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "open browser",
  "rows": [
    {
      "cells": [
        "chrome"
      ],
      "line": 5
    },
    {
      "cells": [
        "firefox"
      ],
      "line": 6
    },
    {
      "cells": [
        "safari"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "nevigate to URl",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.open_browser(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.nevigate_to_URl()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 27,
  "name": "invalid credential",
  "description": "",
  "id": "facebook-test;invalid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@reg"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user type \"user1\" and \"1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user should not see his profile page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "user1",
      "offset": 11
    },
    {
      "val": "1234",
      "offset": 23
    }
  ],
  "location": "StepDefination.user_type_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_should_not_see_his_profile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "open browser",
  "rows": [
    {
      "cells": [
        "chrome"
      ],
      "line": 5
    },
    {
      "cells": [
        "firefox"
      ],
      "line": 6
    },
    {
      "cells": [
        "safari"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "nevigate to URl",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.open_browser(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.nevigate_to_URl()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 28,
  "name": "invalid credential",
  "description": "",
  "id": "facebook-test;invalid-credential;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@reg"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user type \"user2\" and \"1235\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user should not see his profile page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "user2",
      "offset": 11
    },
    {
      "val": "1235",
      "offset": 23
    }
  ],
  "location": "StepDefination.user_type_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.user_should_not_see_his_profile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});