# Bug Fix Documentation
## Bug 1: Blocking the EDT
- **Symptom:** UI freezes when button clicked
- **Cause:** Long operation  runs on EDT
- **Fix:** Run operation in background thread, update UI on EDT
- **Code Change:** [Describe what you changed]

## Bug 2: Missing Listener
- **Symptom:** Button click does nothing
- **Cause:** No ActionListener registered

- **Fix:** Added ActionListener to increment button
- **Code Change:** [Describe what you changed]

## Bug 3: Wrong Thread
- **Symptom:** Erratic behavior, potential crashes
- **Cause:** GUI updated from background thread
- **Fix:** Used SwingUtilities.invokeLater() for GUI updates
- **Code Change:** [Describe what you changed]

## Bug 4: Memory Leak
- **Symptom:** Memory usage grows over time
- **Cause:** References kept in list after removal from UI
- **Fix:** Clear the list when removing buttons
- **Code Change:** [Describe what you changed]

Deliverable:
• Four fixed Java files
• BugFixes.md documentation file